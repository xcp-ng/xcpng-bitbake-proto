
PN = "golang-github-openprinting-ipp-usb"
PE = "0"
PV = "0.9.27"
PR = "3.el10_0"
PACKAGES = "ipp-usb golang-github-openprinting-ipp-usb-devel"


URI_ipp-usb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipp-usb-0.9.27-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipp-usb = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) systemd ( ) libresolv.so.2()(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libusb-1.0.so.0()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) systemd-udev ( )"
RPROVIDES:ipp-usb = "config(ipp-usb) ( =  0.9.27-3.el10_0) ipp-usb ( =  0.9.27-3.el10_0) ipp-usb(x86-64) ( =  0.9.27-3.el10_0)"

URI_golang-github-openprinting-ipp-usb-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/golang-github-openprinting-ipp-usb-devel-0.9.27-3.el10_0.noarch.rpm;unpack=0"
RDEPENDS:golang-github-openprinting-ipp-usb-devel = "go-filesystem ( ) golang(github.com/OpenPrinting/goipp) ( ) pkgconfig(libusb-1.0) ( >=  1.0) pkgconfig(avahi-client) ( >=  0.7)"
RPROVIDES:golang-github-openprinting-ipp-usb-devel = "golang-github-openprinting-ipp-usb-devel ( =  0.9.27-3.el10_0) golang-ipath(github.com/OpenPrinting/ipp-usb) ( =  0.9.27-3.el10_0) golang-ipath(github.com/OpenPrinting/ipp-usb)(tag=0.9.27) ( =  0.9.27-3.el10_0)"
