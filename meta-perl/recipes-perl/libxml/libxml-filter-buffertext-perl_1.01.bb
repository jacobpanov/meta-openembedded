SUMMARY = "XML::Filter::BufferText - Filter to put all characters() in one event"
DESCRIPTION = "\
The XML::Filter::BufferText module is a very simple filter.  One common \
cause of grief (and programmer error) is that XML parsers aren't required \
to provide character events in one chunk.  They can, but are not forced \
to, and most don't.  This filter does the trivial but oft-repeated task \
of putting all characters into a single event. \
"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
HOMEPAGE = "https://metacpan.org/dist/XML-Filter-BufferText"
DEPENDS += "libxml-sax-perl-native"
RDEPENDS:${PN} += "libxml-sax-perl"

SRC_URI = "${CPAN_MIRROR}/authors/id/R/RB/RBERJON/XML-Filter-BufferText-${PV}.tar.gz"
SRC_URI[sha256sum] = "8fd2126d3beec554df852919f4739e689202cbba6a17506e9b66ea165841a75c"

LIC_FILES_CHKSUM = "file://BufferText.pm;beginline=88;endline=90;md5=497aa6d79cc84c3d769a2a0016bee928"

S = "${UNPACKDIR}/XML-Filter-BufferText-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
