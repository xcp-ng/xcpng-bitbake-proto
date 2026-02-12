
inherit dnf-bridge

PN = "yelp-tools"
PE = "0"
PV = "42.1"
PR = "8.el10"
PACKAGES = "yelp-tools"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/yelp-tools-42.1-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_yelp-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/yelp-tools-42.1-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_yelp-tools}"
RDEPENDS:yelp-tools = " \
 python3 \
 itstool \
 mallard-rng \
 libxslt \
 yelp-xsl \
 libxml2 \
 python3-lxml \
"
