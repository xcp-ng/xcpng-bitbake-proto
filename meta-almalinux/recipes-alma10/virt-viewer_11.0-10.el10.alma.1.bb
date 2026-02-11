
inherit dnf-bridge

PN = "virt-viewer"
PE = "0"
PV = "11.0"
PR = "10.el10.alma.1"
PACKAGES = "virt-viewer"


URI_virt-viewer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/virt-viewer-11.0-10.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:virt-viewer = " \
 openssh-clients \
 vte291 \
 spice-glib \
 libxml2 \
 pango \
 gdk-pixbuf2 \
 gvnc \
 spice-gtk3 \
 glib2 \
 gtk3 \
 gtk-vnc2 \
 glibc \
 libvirt-glib \
 libvirt-libs \
 libvirt-client \
"
