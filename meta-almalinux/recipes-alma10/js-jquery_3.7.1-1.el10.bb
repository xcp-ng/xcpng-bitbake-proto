
inherit dnf-bridge

PN = "js-jquery"
PE = "0"
PV = "3.7.1"
PR = "1.el10"
PACKAGES = "js-jquery"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/js-jquery-3.7.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_js-jquery = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/js-jquery-3.7.1-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_js-jquery}"
RDEPENDS:js-jquery = " \
 web-assets-filesystem \
"
