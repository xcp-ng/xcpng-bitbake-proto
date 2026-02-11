
PN = "cockpit-composer"
PE = "0"
PV = "53"
PR = "1.el10"
PACKAGES = "cockpit-composer"


URI_cockpit-composer = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cockpit-composer-53-1.el10.noarch.rpm;unpack=0"
RDEPENDS:cockpit-composer = "cockpit ( ) osbuild-composer ( >=  28)"
RPROVIDES:cockpit-composer = "metainfo() ( ) metainfo(org.image-builder.cockpit-composer.metainfo.xml) ( ) cockpit-composer ( =  53-1.el10)"
