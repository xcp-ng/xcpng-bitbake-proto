
inherit dnf-bridge

PN = "geolite2"
PE = "0"
PV = "20191217"
PR = "14.el10"
PACKAGES = "geolite2-city geolite2-country geolite2-asn"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/geolite2-20191217-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_geolite2-city = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/geolite2-city-20191217-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_geolite2-city}"
RDEPENDS:geolite2-city = ""

URI_geolite2-country = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/geolite2-country-20191217-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_geolite2-country}"
RDEPENDS:geolite2-country = ""

URI_geolite2-asn = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/geolite2-asn-20191217-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_geolite2-asn}"
RDEPENDS:geolite2-asn = ""
