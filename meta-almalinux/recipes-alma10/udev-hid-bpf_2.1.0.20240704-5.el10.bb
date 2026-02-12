
inherit dnf-bridge

PN = "udev-hid-bpf"
PE = "0"
PV = "2.1.0.20240704"
PR = "5.el10"
PACKAGES = "udev-hid-bpf udev-hid-bpf-stable"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/udev-hid-bpf-2.1.0.20240704-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_udev-hid-bpf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/udev-hid-bpf-2.1.0.20240704-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_udev-hid-bpf}"
RDEPENDS:udev-hid-bpf = " \
 zlib-ng-compat \
 systemd-libs \
 systemd-udev \
 libgcc \
 elfutils-libelf \
 glibc \
 udev-hid-bpf-stable \
"

URI_udev-hid-bpf-stable = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/udev-hid-bpf-stable-2.1.0.20240704-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_udev-hid-bpf-stable}"
RDEPENDS:udev-hid-bpf-stable = " \
 udev-hid-bpf \
"
