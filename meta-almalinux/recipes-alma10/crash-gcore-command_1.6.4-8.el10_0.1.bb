
inherit dnf-bridge

PN = "crash-gcore-command"
PE = "0"
PV = "1.6.4"
PR = "8.el10_0.1"
PACKAGES = "crash-gcore-command"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/crash-gcore-command-1.6.4-8.el10_0.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_crash-gcore-command = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/crash-gcore-command-1.6.4-8.el10_0.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_crash-gcore-command}"
RDEPENDS:crash-gcore-command = " \
 glibc \
 crash \
"
