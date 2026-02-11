
inherit dnf-bridge

PN = "kernel"
PE = "0"
PV = "6.12.0"
PR = "55.43.1.el10_0"
PACKAGES = "kernel kernel-abi-stablelists kernel-core kernel-debug kernel-debug-core kernel-debug-modules kernel-debug-modules-core kernel-debug-modules-extra kernel-debug-uki-virt kernel-modules kernel-modules-core kernel-modules-extra kernel-tools kernel-tools-libs kernel-uki-virt kernel-uki-virt-addons kernel-debug-devel kernel-debug-devel-matched kernel-devel kernel-devel-matched kernel-doc kernel-headers perf python3-perf rtla rv kernel-cross-headers kernel-tools-libs-devel libperf kernel-debug-modules-internal kernel-debug-modules-partner kernel-debug-uki-virt-addons kernel-ipaclones-internal kernel-modules-internal kernel-modules-partner kernel-rt-debug-devel-matched kernel-rt-debug-modules-internal kernel-rt-debug-modules-partner kernel-rt-devel-matched kernel-rt-modules-internal kernel-rt-modules-partner kernel-selftests-internal libperf-devel"


URI_kernel = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel = " \
 kernel-modules-core \
 kernel-core \
 kernel-modules \
"

URI_kernel-abi-stablelists = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-abi-stablelists-6.12.0-55.43.1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:kernel-abi-stablelists = ""

URI_kernel-core = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-core-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-core = " \
 systemd \
 systemd-udev \
 bash \
 linux-firmware \
 dracut \
 coreutils \
 kernel-modules-core \
"

URI_kernel-debug = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-debug-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-debug = " \
 kernel-debug-modules-core \
 kernel-debug-modules \
 kernel-debug-core \
"

URI_kernel-debug-core = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-debug-core-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-debug-core = " \
 systemd \
 kernel-debug-modules-core \
 systemd-udev \
 bash \
 linux-firmware \
 dracut \
 coreutils \
"

URI_kernel-debug-modules = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-debug-modules-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-debug-modules = " \
 kernel-debug-modules-core \
 bash \
 kernel-debug-core \
"

URI_kernel-debug-modules-core = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-debug-modules-core-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-debug-modules-core = " \
 bash \
 kernel-debug-core \
"

URI_kernel-debug-modules-extra = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-debug-modules-extra-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-debug-modules-extra = " \
 kernel-debug-modules-core \
 kernel-debug-modules \
 bash \
 kernel-debug-core \
"

URI_kernel-debug-uki-virt = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-debug-uki-virt-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-debug-uki-virt = " \
 systemd \
 kernel-debug-modules-core \
 systemd-udev \
 bash \
 coreutils \
"

URI_kernel-modules = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-modules-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-modules = " \
 kernel-modules-core \
 bash \
 kernel-core \
"

URI_kernel-modules-core = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-modules-core-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-modules-core = " \
 bash \
 kernel-core \
"

URI_kernel-modules-extra = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-modules-extra-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-modules-extra = " \
 kernel-modules-core \
 bash \
 kernel-core \
 kernel-modules \
"

URI_kernel-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-tools-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-tools = " \
 python3 \
 python3-pyyaml \
 libnl3 \
 libcap \
 pciutils-libs \
 ncurses-libs \
 glibc \
 kernel-tools-libs \
 python3-jsonschema \
"

URI_kernel-tools-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-tools-libs-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-tools-libs = " \
 glibc \
 bash \
"

URI_kernel-uki-virt = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-uki-virt-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-uki-virt = " \
 systemd \
 systemd-udev \
 bash \
 coreutils \
 kernel-modules-core \
"

URI_kernel-uki-virt-addons = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kernel-uki-virt-addons-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-uki-virt-addons = " \
 kernel-uki-virt \
 systemd \
"

URI_kernel-debug-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kernel-debug-devel-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-debug-devel = " \
 flex \
 make \
 bison \
 openssl-devel \
 bash \
 gcc \
 perl-interpreter \
 findutils \
 elfutils-libelf-devel \
"

URI_kernel-debug-devel-matched = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kernel-debug-devel-matched-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-debug-devel-matched = " \
 kernel-debug-devel \
 kernel-debug-core \
"

URI_kernel-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kernel-devel-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-devel = " \
 flex \
 make \
 bison \
 openssl-devel \
 bash \
 gcc \
 perl-interpreter \
 findutils \
 elfutils-libelf-devel \
"

URI_kernel-devel-matched = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kernel-devel-matched-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-devel-matched = " \
 kernel-core \
 kernel-devel \
"

URI_kernel-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kernel-doc-6.12.0-55.43.1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:kernel-doc = ""

URI_kernel-headers = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kernel-headers-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-headers = ""

URI_perf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perf-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perf = " \
 perl-libs \
 perf \
 numactl-libs \
 libbpf \
 python3-libs \
 libstdc++ \
 libtraceevent \
 xz-libs \
 zlib-ng-compat \
 libbabeltrace \
 slang \
 openssl-libs \
 elfutils-libelf \
 libzstd \
 elfutils-libs \
 bash \
 perl-Exporter \
 bzip2 \
 perl-POSIX \
 glibc \
 perl-interpreter \
 llvm-libs \
 perl-lib \
"

URI_python3-perf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-perf-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-perf = " \
 python3 \
 zlib-ng-compat \
 perl-libs \
 numactl-libs \
 libbabeltrace \
 slang \
 openssl-libs \
 libbpf \
 elfutils-libelf \
 python3-libs \
 libzstd \
 elfutils-libs \
 libstdc++ \
 glibc \
 libtraceevent \
 llvm-libs \
 xz-libs \
"

URI_rtla = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rtla-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rtla = " \
 glibc \
 libtraceevent \
 libtracefs \
 kernel-tools-libs \
"

URI_rv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rv-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rv = " \
 glibc \
 libtraceevent \
 libtracefs \
"

URI_kernel-cross-headers = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/kernel-cross-headers-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-cross-headers = ""

URI_kernel-tools-libs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/kernel-tools-libs-devel-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-tools-libs-devel = " \
 kernel-tools-libs \
 kernel-tools \
"

URI_libperf = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libperf-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libperf = " \
 glibc \
"

URI_kernel-debug-modules-internal = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kernel-debug-modules-internal-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-debug-modules-internal = " \
 kernel-debug-modules-core \
 kernel-debug-modules \
 bash \
 kernel-debug-core \
"

URI_kernel-debug-modules-partner = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kernel-debug-modules-partner-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-debug-modules-partner = " \
 kernel-debug-modules-core \
 kernel-debug-modules \
 bash \
 kernel-debug-core \
"

URI_kernel-debug-uki-virt-addons = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kernel-debug-uki-virt-addons-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-debug-uki-virt-addons = " \
 kernel-debug-uki-virt \
 systemd \
"

URI_kernel-ipaclones-internal = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kernel-ipaclones-internal-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-ipaclones-internal = ""

URI_kernel-modules-internal = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kernel-modules-internal-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-modules-internal = " \
 kernel-modules-core \
 bash \
 kernel-core \
 kernel-modules \
"

URI_kernel-modules-partner = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kernel-modules-partner-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-modules-partner = " \
 kernel-modules-core \
 bash \
 kernel-core \
 kernel-modules \
"

URI_kernel-rt-debug-devel-matched = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kernel-rt-debug-devel-matched-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-rt-debug-devel-matched = ""

URI_kernel-rt-debug-modules-internal = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kernel-rt-debug-modules-internal-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-rt-debug-modules-internal = " \
 bash \
"

URI_kernel-rt-debug-modules-partner = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kernel-rt-debug-modules-partner-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-rt-debug-modules-partner = " \
 bash \
"

URI_kernel-rt-devel-matched = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kernel-rt-devel-matched-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-rt-devel-matched = ""

URI_kernel-rt-modules-internal = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kernel-rt-modules-internal-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-rt-modules-internal = " \
 bash \
"

URI_kernel-rt-modules-partner = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kernel-rt-modules-partner-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-rt-modules-partner = " \
 bash \
"

URI_kernel-selftests-internal = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kernel-selftests-internal-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kernel-selftests-internal = " \
 python3 \
 perl-libs \
 keyutils \
 iproute-tc \
 bpftool \
 numactl-libs \
 perl-IO \
 libcap \
 libstdc++ \
 zlib-ng-compat \
 libgcc \
 openssl-libs \
 libxml2 \
 elfutils-libelf \
 libzstd \
 bash \
 binutils \
 nmap-ncat \
 fuse-libs \
 libmnl \
 glibc \
 perl-interpreter \
 llvm-libs \
"

URI_libperf-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libperf-devel-6.12.0-55.43.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libperf-devel = " \
 pkgconf-pkg-config \
 libperf \
"
