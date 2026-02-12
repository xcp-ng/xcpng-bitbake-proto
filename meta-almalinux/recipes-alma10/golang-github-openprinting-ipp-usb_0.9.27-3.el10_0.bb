
inherit dnf-bridge

PN = "golang-github-openprinting-ipp-usb"
PE = "0"
PV = "0.9.27"
PR = "3.el10_0"
PACKAGES = "ipp-usb golang-github-openprinting-ipp-usb-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/golang-github-openprinting-ipp-usb-0.9.27-3.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ipp-usb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipp-usb-0.9.27-3.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ipp-usb}"
RDEPENDS:ipp-usb = " \
 systemd \
 systemd-udev \
 avahi-libs \
 bash \
 glibc \
 libusb1 \
"

URI_golang-github-openprinting-ipp-usb-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/golang-github-openprinting-ipp-usb-devel-0.9.27-3.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_golang-github-openprinting-ipp-usb-devel}"
RDEPENDS:golang-github-openprinting-ipp-usb-devel = " \
 libusb1-devel \
 golang-github-openprinting-goipp-devel \
 avahi-devel \
 go-filesystem \
"
