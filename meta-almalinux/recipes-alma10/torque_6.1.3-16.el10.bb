
inherit dnf-bridge

PN = "torque"
PE = "0"
PV = "6.1.3"
PR = "16.el10"
PACKAGES = "torque-libs torque torque-client torque-devel torque-docs torque-drmaa torque-drmaa-devel torque-gui torque-mom torque-pam torque-scheduler torque-server"


URI_torque-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/torque-libs-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-libs = " \
 jsoncpp \
 zlib-ng-compat \
 libgcc \
 munge-libs \
 libxml2 \
 munge \
 hwloc-libs \
 libstdc++ \
 glibc \
"

URI_torque = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque = " \
 setup \
 systemd \
 munge \
 grep \
 libstdc++ \
 bash \
 torque-libs \
 glibc \
 coreutils \
"

URI_torque-client = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-client-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-client = " \
 zlib-ng-compat \
 libgcc \
 readline \
 tcl \
 libstdc++ \
 bash \
 torque-libs \
 glibc \
 alternatives \
"

URI_torque-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-devel-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-devel = " \
 bash \
 torque-libs \
"

URI_torque-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-docs-6.1.3-16.el10.noarch.rpm;unpack=0"
RDEPENDS:torque-docs = " \
 torque \
"

URI_torque-drmaa = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-drmaa-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-drmaa = " \
 jsoncpp \
 zlib-ng-compat \
 libgcc \
 munge-libs \
 libxml2 \
 hwloc-libs \
 libstdc++ \
 torque-libs \
 glibc \
"

URI_torque-drmaa-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-drmaa-devel-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-drmaa-devel = " \
 torque-devel \
 torque-drmaa \
"

URI_torque-gui = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-gui-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-gui = " \
 torque-client \
 libgcc \
 tcl \
 tk \
 libstdc++ \
 torque-libs \
 glibc \
"

URI_torque-mom = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-mom-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-mom = " \
 jsoncpp \
 systemd \
 openssh-clients \
 libgcc \
 munge \
 libxml2 \
 hwloc-libs \
 libstdc++ \
 bash \
 torque-libs \
 glibc \
"

URI_torque-pam = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-pam-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-pam = " \
 jsoncpp \
 zlib-ng-compat \
 libgcc \
 munge-libs \
 libxml2 \
 pam-libs \
 hwloc-libs \
 libstdc++ \
 glibc \
"

URI_torque-scheduler = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-scheduler-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-scheduler = " \
 glibc \
 systemd \
 bash \
 torque-libs \
"

URI_torque-server = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-server-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-server = " \
 jsoncpp \
 systemd \
 openssh-server \
 libgcc \
 munge-libs \
 libxml2 \
 munge \
 libstdc++ \
 bash \
 torque-libs \
 glibc \
"
