
inherit dnf-bridge

PN = "greenboot"
PE = "0"
PV = "0.15.9"
PR = "1.el10_0"
PACKAGES = "greenboot greenboot-default-health-checks"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/greenboot-0.15.9-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_greenboot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/greenboot-0.15.9-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_greenboot}"
RDEPENDS:greenboot = " \
 systemd \
 grub2-tools-minimal \
 pam \
 bash \
 rpm-ostree \
"

URI_greenboot-default-health-checks = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/greenboot-default-health-checks-0.15.9-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_greenboot-default-health-checks}"
RDEPENDS:greenboot-default-health-checks = " \
 util-linux \
 jq \
 bash \
 greenboot \
"
