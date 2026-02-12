
inherit dnf-bridge

PN = "xdg-desktop-portal-gtk"
PE = "0"
PV = "1.15.1"
PR = "8.el10"
PACKAGES = "xdg-desktop-portal-gtk"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xdg-desktop-portal-gtk-1.15.1-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xdg-desktop-portal-gtk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xdg-desktop-portal-gtk-1.15.1-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xdg-desktop-portal-gtk}"
RDEPENDS:xdg-desktop-portal-gtk = " \
 xdg-desktop-portal \
 gsettings-desktop-schemas \
 libgcc \
 fontconfig \
 gdk-pixbuf2 \
 bash \
 glib2 \
 gtk3 \
 dbus \
 glibc \
"
