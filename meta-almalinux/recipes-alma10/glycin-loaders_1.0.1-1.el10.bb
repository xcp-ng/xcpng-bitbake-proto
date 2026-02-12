
inherit dnf-bridge

PN = "glycin-loaders"
PE = "0"
PV = "1.0.1"
PR = "1.el10"
PACKAGES = "glycin-loaders"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/glycin-loaders-1.0.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_glycin-loaders = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/glycin-loaders-1.0.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_glycin-loaders}"
RDEPENDS:glycin-loaders = " \
 libgcc \
 libxml2 \
 pango \
 cairo \
 glib2 \
 glibc \
"
