
PN = "initscripts"
PE = "0"
PV = "10.26"
PR = "2.el10"
PACKAGES = "initscripts initscripts-rename-device initscripts-service netconsole-service readonly-root"


URI_initscripts = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/initscripts-10.26-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:initscripts = " \
 setup \
 initscripts-service \
 shadow-utils \
 systemd \
 util-linux \
 chkconfig \
 gawk \
 grep \
 filesystem \
 bash \
 popt \
 procps-ng \
 glibc \
 coreutils \
 initscripts-rename-device \
 findutils \
"

URI_initscripts-rename-device = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/initscripts-rename-device-10.26-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:initscripts-rename-device = " \
 gawk \
 bash \
 glib2 \
 glibc \
 coreutils \
 filesystem \
"

URI_initscripts-service = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/initscripts-service-10.26-2.el10.noarch.rpm;unpack=0"
RDEPENDS:initscripts-service = " \
 systemd \
 gawk \
 bash \
 coreutils \
 filesystem \
"

URI_netconsole-service = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/netconsole-service-10.26-2.el10.noarch.rpm;unpack=0"
RDEPENDS:netconsole-service = " \
 glibc-common \
 util-linux \
 iproute \
 kmod \
 gawk \
 iputils \
 bash \
 initscripts \
 sed \
 coreutils \
 filesystem \
"

URI_readonly-root = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/readonly-root-10.26-2.el10.noarch.rpm;unpack=0"
RDEPENDS:readonly-root = " \
 ipcalc \
 util-linux \
 iproute \
 gawk \
 hostname \
 filesystem \
 bash \
 initscripts \
 coreutils \
 cpio \
 findutils \
"
