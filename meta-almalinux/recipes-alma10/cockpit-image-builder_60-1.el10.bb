
PN = "cockpit-image-builder"
PE = "0"
PV = "60"
PR = "1.el10"
PACKAGES = "cockpit-image-builder"


URI_cockpit-image-builder = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cockpit-image-builder-60-1.el10.noarch.rpm;unpack=0"
RDEPENDS:cockpit-image-builder = "cockpit ( ) cockpit-files ( ) osbuild-composer ( >=  131)"
RPROVIDES:cockpit-image-builder = "metainfo() ( ) metainfo(org.image-builder.cockpit-image-builder.metainfo.xml) ( ) cockpit-composer ( =  60-1.el10) cockpit-image-builder ( =  60-1.el10)"
