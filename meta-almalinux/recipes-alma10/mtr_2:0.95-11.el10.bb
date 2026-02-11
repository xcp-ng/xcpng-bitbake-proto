
inherit dnf-bridge

PN = "mtr"
PE = "2"
PV = "0.95"
PR = "11.el10"
PACKAGES = "mtr mtr-gtk"


URI_mtr = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mtr-0.95-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mtr = " \
 glibc \
 ncurses-libs \
 jansson \
"

URI_mtr-gtk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mtr-gtk-0.95-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mtr-gtk = " \
 jansson \
 gdk-pixbuf2 \
 mtr \
 ncurses-libs \
 glib2 \
 gtk3 \
 glibc \
"
