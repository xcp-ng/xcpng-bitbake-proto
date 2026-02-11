
PN = "cockpit-image-builder"
PE = "0"
PV = "60"
PR = "1.el10"
PACKAGES = "cockpit-image-builder"


URI_cockpit-image-builder = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cockpit-image-builder-60-1.el10.noarch.rpm;unpack=0"
RDEPENDS:cockpit-image-builder = "
 cockpit-files
 cockpit
 osbuild-composer
"
