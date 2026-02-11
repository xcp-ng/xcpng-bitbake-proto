
PN = "hyperv-daemons"
PE = "0"
PV = "0"
PR = "0.49.20220731git.el10"
PACKAGES = "hyperv-daemons hyperv-daemons-license hyperv-tools hypervfcopyd hypervkvpd hypervvssd"


URI_hyperv-daemons = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyperv-daemons-0-0.49.20220731git.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hyperv-daemons = " \
 hypervvssd \
 hypervfcopyd \
 hypervkvpd \
"

URI_hyperv-daemons-license = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyperv-daemons-license-0-0.49.20220731git.el10.noarch.rpm;unpack=0"
RDEPENDS:hyperv-daemons-license = ""

URI_hyperv-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyperv-tools-0-0.49.20220731git.el10.noarch.rpm;unpack=0"
RDEPENDS:hyperv-tools = " \
 python3 \
"

URI_hypervfcopyd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hypervfcopyd-0-0.49.20220731git.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hypervfcopyd = " \
 glibc \
 hyperv-daemons-license \
 systemd \
 bash \
"

URI_hypervkvpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hypervkvpd-0-0.49.20220731git.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hypervkvpd = " \
 glibc \
 hyperv-daemons-license \
 systemd \
 bash \
"

URI_hypervvssd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hypervvssd-0-0.49.20220731git.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hypervvssd = " \
 glibc \
 hyperv-daemons-license \
 systemd \
 bash \
"
