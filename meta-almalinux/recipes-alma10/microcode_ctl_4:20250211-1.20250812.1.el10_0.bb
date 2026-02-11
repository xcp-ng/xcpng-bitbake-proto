
inherit dnf-bridge

PN = "microcode_ctl"
PE = "4"
PV = "20250211"
PR = "1.20250812.1.el10_0"
PACKAGES = "microcode_ctl microcode_ctl"


URI_microcode_ctl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/microcode_ctl-20250211-1.20250812.1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:microcode_ctl = " \
 coreutils \
 systemd \
 bash \
 dracut \
"

URI_microcode_ctl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/microcode_ctl-20250211-1.20250812.1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:microcode_ctl = " \
 coreutils \
 systemd \
 bash \
 dracut \
"
