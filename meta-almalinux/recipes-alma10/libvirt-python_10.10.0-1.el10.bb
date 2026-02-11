
inherit dnf-bridge

PN = "libvirt-python"
PE = "0"
PV = "10.10.0"
PR = "1.el10"
PACKAGES = "python3-libvirt"


URI_python3-libvirt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libvirt-10.10.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libvirt = " \
 glibc \
 libvirt-libs \
 python3 \
"
