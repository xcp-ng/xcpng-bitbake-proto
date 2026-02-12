
inherit dnf-bridge

PN = "dconf-editor"
PE = "0"
PV = "45.0.1"
PR = "6.el10"
PACKAGES = "dconf-editor"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/dconf-editor-45.0.1-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dconf-editor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dconf-editor-45.0.1-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dconf-editor}"
RDEPENDS:dconf-editor = " \
 libhandy \
 glib2 \
 gtk3 \
 dconf \
 glibc \
"
