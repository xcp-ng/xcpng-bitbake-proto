
inherit dnf-bridge

PN = "tuned"
PE = "0"
PV = "2.25.1"
PR = "2.el10_0"
PACKAGES = "tuned tuned-profiles-cpu-partitioning tuned-gtk tuned-ppd tuned-profiles-atomic tuned-profiles-mssql tuned-profiles-oracle tuned-profiles-postgresql tuned-profiles-spectrumscale tuned-utils tuned-profiles-compat tuned-profiles-nfv tuned-profiles-nfv-guest tuned-profiles-nfv-host tuned-profiles-openshift tuned-profiles-realtime tuned-utils-systemtap"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/tuned-2.25.1-2.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tuned = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tuned-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned}"
RDEPENDS:tuned = " \
 python3 \
 python3-pyudev \
 systemd \
 util-linux \
 iproute \
 kmod \
 gawk \
 python3-dbus \
 hdparm \
 polkit \
 virt-what \
 bash \
 dbus \
 python3-gobject-base \
 ethtool \
 python3-linux-procfs \
 python3-inotify \
"

URI_tuned-profiles-cpu-partitioning = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tuned-profiles-cpu-partitioning-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-profiles-cpu-partitioning}"
RDEPENDS:tuned-profiles-cpu-partitioning = " \
 bash \
 tuned \
"

URI_tuned-gtk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-gtk-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-gtk}"
RDEPENDS:tuned-gtk = " \
 python3 \
 polkit \
 python3-gobject-base \
 powertop \
 tuned \
"

URI_tuned-ppd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-ppd-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-ppd}"
RDEPENDS:tuned-ppd = " \
 python3 \
 bash \
 tuned \
"

URI_tuned-profiles-atomic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-profiles-atomic-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-profiles-atomic}"
RDEPENDS:tuned-profiles-atomic = " \
 tuned \
"

URI_tuned-profiles-mssql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-profiles-mssql-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-profiles-mssql}"
RDEPENDS:tuned-profiles-mssql = " \
 tuned \
"

URI_tuned-profiles-oracle = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-profiles-oracle-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-profiles-oracle}"
RDEPENDS:tuned-profiles-oracle = " \
 tuned \
"

URI_tuned-profiles-postgresql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-profiles-postgresql-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-profiles-postgresql}"
RDEPENDS:tuned-profiles-postgresql = " \
 tuned \
"

URI_tuned-profiles-spectrumscale = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-profiles-spectrumscale-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-profiles-spectrumscale}"
RDEPENDS:tuned-profiles-spectrumscale = " \
 tuned \
"

URI_tuned-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-utils-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-utils}"
RDEPENDS:tuned-utils = " \
 python3 \
 powertop \
 tuned \
"

URI_tuned-profiles-compat = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-profiles-compat-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-profiles-compat}"
RDEPENDS:tuned-profiles-compat = " \
 bash \
 tuned \
"

URI_tuned-profiles-nfv = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-profiles-nfv-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-profiles-nfv}"
RDEPENDS:tuned-profiles-nfv = " \
 tuned-profiles-nfv-guest \
 tuned-profiles-nfv-host \
 tuned \
"

URI_tuned-profiles-nfv-guest = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-profiles-nfv-guest-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-profiles-nfv-guest}"
RDEPENDS:tuned-profiles-nfv-guest = " \
 tuned-profiles-realtime \
 tuned \
"

URI_tuned-profiles-nfv-host = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-profiles-nfv-host-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-profiles-nfv-host}"
RDEPENDS:tuned-profiles-nfv-host = " \
 bash \
 tuned-profiles-realtime \
 tuned \
"

URI_tuned-profiles-openshift = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-profiles-openshift-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-profiles-openshift}"
RDEPENDS:tuned-profiles-openshift = " \
 tuned \
"

URI_tuned-profiles-realtime = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-profiles-realtime-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-profiles-realtime}"
RDEPENDS:tuned-profiles-realtime = " \
 tuned \
"

URI_tuned-utils-systemtap = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-utils-systemtap-2.25.1-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuned-utils-systemtap}"
RDEPENDS:tuned-utils-systemtap = " \
 python3 \
 systemtap \
 systemtap-client \
 tuned \
"
