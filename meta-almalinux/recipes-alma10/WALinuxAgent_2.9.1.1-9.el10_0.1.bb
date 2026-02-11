
PN = "WALinuxAgent"
PE = "0"
PV = "2.9.1.1"
PR = "9.el10_0.1"
PACKAGES = "WALinuxAgent WALinuxAgent-udev"


URI_WALinuxAgent = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/WALinuxAgent-2.9.1.1-9.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:WALinuxAgent = " \
 python3 \
 WALinuxAgent-udev \
 systemd \
 openssh \
 openssh-server \
 python3-pyasn1 \
 openssl \
 parted \
 bash \
 iptables-nft \
"

URI_WALinuxAgent-udev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/WALinuxAgent-udev-2.9.1.1-9.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:WALinuxAgent-udev = " \
 bash \
"
