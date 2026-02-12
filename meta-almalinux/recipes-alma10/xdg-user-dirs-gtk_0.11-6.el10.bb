
inherit dnf-bridge

PN = "xdg-user-dirs-gtk"
PE = "0"
PV = "0.11"
PR = "6.el10"
PACKAGES = "xdg-user-dirs-gtk"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xdg-user-dirs-gtk-0.11-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xdg-user-dirs-gtk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xdg-user-dirs-gtk-0.11-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xdg-user-dirs-gtk}"
RDEPENDS:xdg-user-dirs-gtk = " \
 glibc \
 xdg-user-dirs \
 glib2 \
 gtk3 \
"
