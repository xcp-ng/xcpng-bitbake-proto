
PN = "intel-cmt-cat"
PE = "0"
PV = "23.11"
PR = "6.el10"
PACKAGES = "intel-cmt-cat intel-cmt-cat-devel"


URI_intel-cmt-cat = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/intel-cmt-cat-23.11-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:intel-cmt-cat = " \
 glibc \
 bash \
"

URI_intel-cmt-cat-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/intel-cmt-cat-devel-23.11-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:intel-cmt-cat-devel = " \
 intel-cmt-cat \
"
