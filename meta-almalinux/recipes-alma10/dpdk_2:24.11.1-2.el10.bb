
PN = "dpdk"
PE = "2"
PV = "24.11.1"
PR = "2.el10"
PACKAGES = "dpdk dpdk-devel dpdk-doc dpdk-tools"


URI_dpdk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dpdk-24.11.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dpdk = " \
 glibc \
 libarchive \
 libibverbs \
 numactl-libs \
"

URI_dpdk-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dpdk-devel-24.11.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dpdk-devel = " \
 python3 \
 libarchive-devel \
 dpdk \
 dpdk-devel \
 pkgconf-pkg-config \
 bash \
 rdma-core-devel \
"

URI_dpdk-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dpdk-doc-24.11.1-2.el10.noarch.rpm;unpack=0"
RDEPENDS:dpdk-doc = ""

URI_dpdk-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dpdk-tools-24.11.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dpdk-tools = " \
 python3 \
 dpdk \
 iproute \
 kmod \
 pciutils \
 findutils \
"
