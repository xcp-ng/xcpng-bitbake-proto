
inherit dnf-bridge

PN = "cronie"
PE = "0"
PV = "1.7.0"
PR = "9.el10"
PACKAGES = "cronie cronie-anacron cronie-noanacron"


URI_cronie = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cronie-1.7.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cronie = " \
 glibc \
 cronie-noanacron \
 audit-libs \
 pam \
 pam-libs \
 libselinux \
 bash \
 sed \
 coreutils \
"

URI_cronie-anacron = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cronie-anacron-1.7.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cronie-anacron = " \
 crontabs \
 bash \
 glibc \
 coreutils \
 cronie \
"

URI_cronie-noanacron = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cronie-noanacron-1.7.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cronie-noanacron = " \
 crontabs \
 cronie \
"
