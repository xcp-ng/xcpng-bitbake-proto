
PN = "yelp-xsl"
PE = "0"
PV = "42.1"
PR = "7.el10"
PACKAGES = "yelp-xsl yelp-xsl-devel"


URI_yelp-xsl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/yelp-xsl-42.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:yelp-xsl = ""
RPROVIDES:yelp-xsl = "yelp-xsl ( =  42.1-7.el10)"

URI_yelp-xsl-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/yelp-xsl-devel-42.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:yelp-xsl-devel = "/usr/bin/pkg-config ( ) yelp-xsl ( =  42.1-7.el10)"
RPROVIDES:yelp-xsl-devel = "pkgconfig(yelp-xsl) ( =  42.1) yelp-xsl-devel ( =  42.1-7.el10)"
