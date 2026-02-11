
PN = "yelp-tools"
PE = "0"
PV = "42.1"
PR = "8.el10"
PACKAGES = "yelp-tools"


URI_yelp-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/yelp-tools-42.1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:yelp-tools = "/usr/bin/python3 ( ) python3-lxml ( ) /usr/bin/xsltproc ( ) /usr/bin/itstool ( ) mallard-rng ( ) yelp-xsl ( ) /usr/bin/xmllint ( )"
RPROVIDES:yelp-tools = "application() ( ) application(yelp-build-url-handler.desktop) ( ) mimehandler(x-scheme-handler/help) ( ) yelp-tools ( =  42.1-8.el10)"
