DESCRIPTION = "Google Authentication Library"
HOMEPAGE = "https://github.com/googleapis/google-auth-library-python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

inherit pypi setuptools3 ptest

SRC_URI[sha256sum] = "500c3a29adedeb36ea9cf24b8d10858e152f2412e3ca37829b3fa18e33d63b77"
SRC_URI += " \
        file://run-ptest \
"

PYPI_PACKAGE = "google_auth"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"

RDEPENDS:${PN}-ptest += " \
        python3-aioresponses \
        python3-cryptography \
        python3-flask \
        python3-freezegun \
        python3-grpcio \
        python3-mock \
        python3-pyjwt \
        python3-pyopenssl \
        python3-pytest \
        python3-pytest-asyncio \
        python3-pytest-localserver \
        python3-pyu2f \
        python3-requests \
        python3-responses \
        python3-unittest-automake-output \
        python3-unixadmin \
"

do_install_ptest() {
        install -d ${D}${PTEST_PATH}/tests
        cp -rf ${S}/tests/* ${D}${PTEST_PATH}/tests/
}

RDEPENDS:${PN} += "\
        python3-cachetools \
        python3-json \
        python3-pyasn1-modules \
        python3-rsa \
"
