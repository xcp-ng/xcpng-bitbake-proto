
inherit dnf-bridge

PN = "flashrom"
PE = "0"
PV = "1.3.0"
PR = "8.el10"
PACKAGES = "flashrom flashrom-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/flashrom-1.3.0-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_flashrom = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flashrom-1.3.0-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_flashrom}"
RDEPENDS:flashrom = " \
 systemd-udev \
 dmidecode \
 pciutils-libs \
 glibc \
 libusb1 \
"

URI_flashrom-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flashrom-devel-1.3.0-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_flashrom-devel}"
RDEPENDS:flashrom-devel = " \
 libusb1-devel \
 flashrom \
 pkgconf-pkg-config \
 pciutils-devel \
"
