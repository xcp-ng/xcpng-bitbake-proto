
PN = "os-prober"
PE = "0"
PV = "1.81"
PR = "9.el10"
PACKAGES = "os-prober"


URI_os-prober = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/os-prober-1.81-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:os-prober = " \
 grub2-tools-minimal \
 util-linux \
 systemd-udev \
 kmod \
 grep \
 bash \
 glibc \
 coreutils \
 sed \
"
