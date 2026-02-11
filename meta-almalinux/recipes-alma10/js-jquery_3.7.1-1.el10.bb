
PN = "js-jquery"
PE = "0"
PV = "3.7.1"
PR = "1.el10"
PACKAGES = "js-jquery"


URI_js-jquery = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/js-jquery-3.7.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:js-jquery = "web-assets-filesystem ( )"
RPROVIDES:js-jquery = "bundled(js-sizzle) ( =  2.3.5) bundled(sizzle) ( =  2.3.5) jquery ( =  3.7.1-1.el10) js-jquery ( =  3.7.1-1.el10) js-jquery-static ( =  3.7.1-1.el10) js-jquery3 ( =  3.7.1-1.el10) js-jquery3-static ( =  3.7.1-1.el10)"
