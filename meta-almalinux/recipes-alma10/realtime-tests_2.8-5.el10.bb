
inherit dnf-bridge

PN = "realtime-tests"
PE = "0"
PV = "2.8"
PR = "5.el10"
PACKAGES = "realtime-tests"


URI_realtime-tests = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/realtime-tests-2.8-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:realtime-tests = " \
 python3 \
 numactl-libs \
 bash \
 bc \
 glibc \
 kernel-tools-libs \
"
