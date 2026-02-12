
inherit dnf-bridge

PN = "NetworkManager-libreswan"
PE = "0"
PV = "1.2.27"
PR = "2.el10_0"
PACKAGES = "NetworkManager-libreswan NetworkManager-libreswan-gnome"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/NetworkManager-libreswan-1.2.27-2.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_NetworkManager-libreswan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/NetworkManager-libreswan-1.2.27-2.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_NetworkManager-libreswan}"
RDEPENDS:NetworkManager-libreswan = " \
 libreswan \
 NetworkManager \
 libgcc \
 libnl3 \
 glib2 \
 dbus-common \
 glibc \
 NetworkManager-libnm \
"

URI_NetworkManager-libreswan-gnome = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/NetworkManager-libreswan-gnome-1.2.27-2.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_NetworkManager-libreswan-gnome}"
RDEPENDS:NetworkManager-libreswan-gnome = " \
 NetworkManager-libreswan \
 pango \
 NetworkManager-libnm \
 libnma \
 libnma-gtk4 \
 cairo \
 cairo-gobject \
 atk \
 shared-mime-info \
 libgcc \
 gdk-pixbuf2 \
 libsecret \
 graphene \
 vulkan-loader \
 harfbuzz \
 glib2 \
 gtk3 \
 glibc \
 gtk4 \
"
