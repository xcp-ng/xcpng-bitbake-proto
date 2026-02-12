
inherit dnf-bridge

PN = "zenity"
PE = "0"
PV = "4.0.1"
PR = "5.el10"
PACKAGES = "zenity"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/zenity-4.0.1-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_zenity = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/zenity-4.0.1-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_zenity}"
RDEPENDS:zenity = " \
 libgcc \
 pango \
 glib2 \
 glibc \
 gtk4 \
 libadwaita \
"
