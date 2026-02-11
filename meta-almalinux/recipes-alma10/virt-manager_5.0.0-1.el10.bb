
PN = "virt-manager"
PE = "0"
PV = "5.0.0"
PR = "1.el10"
PACKAGES = "virt-install virt-manager-common virt-manager"


URI_virt-install = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/virt-install-5.0.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:virt-install = " \
 python3 \
 virt-manager-common \
 libvirt-client \
"

URI_virt-manager-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/virt-manager-common-5.0.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:virt-manager-common = " \
 python3-requests \
 libosinfo \
 python3-libvirt \
 python3-libxml2 \
 python3-gobject-base \
 xorriso \
 python3-argcomplete \
"

URI_virt-manager = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/virt-manager-5.0.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:virt-manager = " \
 python3 \
 python3-gobject \
 virt-manager-common \
 gtk-vnc2 \
 dconf \
 vte291 \
 gtk3 \
 libvirt-glib \
"
