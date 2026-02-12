
inherit dnf-bridge

PN = "rear"
PE = "0"
PV = "2.9"
PR = "2.el10"
PACKAGES = "rear"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/rear-2.9-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rear = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rear-2.9-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rear}"
RDEPENDS:rear = " \
 syslinux-extlinux \
 iproute \
 tar \
 iputils \
 util-linux \
 dhcpcd \
 dosfstools \
 xorriso \
 attr \
 openssl \
 parted \
 bash \
 ethtool \
 bc \
 binutils \
 grub2-efi-x64-modules \
 file \
 gzip \
 gawk \
"
