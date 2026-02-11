
PN = "tuned"
PE = "0"
PV = "2.25.1"
PR = "2.el10_0"
PACKAGES = "tuned tuned-profiles-cpu-partitioning tuned-gtk tuned-ppd tuned-profiles-atomic tuned-profiles-mssql tuned-profiles-oracle tuned-profiles-postgresql tuned-profiles-spectrumscale tuned-utils tuned-profiles-compat tuned-profiles-nfv tuned-profiles-nfv-guest tuned-profiles-nfv-host tuned-profiles-openshift tuned-profiles-realtime tuned-utils-systemtap"


URI_tuned = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tuned-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned = "/bin/sh ( ) systemd ( ) virt-what ( ) /usr/bin/sh ( ) /usr/bin/bash ( ) /usr/bin/python3 ( ) util-linux ( ) gawk ( ) dbus ( ) iproute ( ) kmod ( ) polkit ( ) python3-dbus ( ) python3-gobject-base ( ) ethtool ( ) python3-inotify ( ) hdparm ( ) python3-linux-procfs ( ) python3-pyudev ( ) python(abi) ( =  3.12)"
RPROVIDES:tuned = "config(tuned) ( =  2.25.1-2.el10_0) tuned ( =  2.25.1-2.el10_0)"

URI_tuned-profiles-cpu-partitioning = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tuned-profiles-cpu-partitioning-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-profiles-cpu-partitioning = "/usr/bin/bash ( ) tuned ( =  2.25.1)"
RPROVIDES:tuned-profiles-cpu-partitioning = "config(tuned-profiles-cpu-partitioning) ( =  2.25.1-2.el10_0) tuned-profiles-cpu-partitioning ( =  2.25.1-2.el10_0)"

URI_tuned-gtk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-gtk-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-gtk = "/usr/bin/python3 ( ) python3-gobject-base ( ) polkit ( ) powertop ( ) python(abi) ( =  3.12) tuned ( =  2.25.1-2.el10_0)"
RPROVIDES:tuned-gtk = "application() ( ) application(tuned-gui.desktop) ( ) tuned-gtk ( =  2.25.1-2.el10_0)"

URI_tuned-ppd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-ppd-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-ppd = "/bin/sh ( ) /usr/bin/python3 ( ) tuned ( =  2.25.1)"
RPROVIDES:tuned-ppd = "ppd-service ( ) config(tuned-ppd) ( =  2.25.1-2.el10_0) tuned-ppd ( =  2.25.1-2.el10_0)"

URI_tuned-profiles-atomic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-profiles-atomic-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-profiles-atomic = "tuned ( =  2.25.1)"
RPROVIDES:tuned-profiles-atomic = "tuned-profiles-atomic ( =  2.25.1-2.el10_0)"

URI_tuned-profiles-mssql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-profiles-mssql-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-profiles-mssql = "tuned ( =  2.25.1)"
RPROVIDES:tuned-profiles-mssql = "tuned-profiles-mssql ( =  2.25.1-2.el10_0)"

URI_tuned-profiles-oracle = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-profiles-oracle-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-profiles-oracle = "tuned ( =  2.25.1)"
RPROVIDES:tuned-profiles-oracle = "tuned-profiles-oracle ( =  2.25.1-2.el10_0)"

URI_tuned-profiles-postgresql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-profiles-postgresql-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-profiles-postgresql = "tuned ( =  2.25.1)"
RPROVIDES:tuned-profiles-postgresql = "tuned-profiles-postgresql ( =  2.25.1-2.el10_0)"

URI_tuned-profiles-spectrumscale = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-profiles-spectrumscale-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-profiles-spectrumscale = "tuned ( =  2.25.1)"
RPROVIDES:tuned-profiles-spectrumscale = "tuned-profiles-spectrumscale ( =  2.25.1-2.el10_0)"

URI_tuned-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tuned-utils-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-utils = "/usr/bin/python3 ( ) powertop ( ) tuned ( =  2.25.1-2.el10_0)"
RPROVIDES:tuned-utils = "tuned-utils ( =  2.25.1-2.el10_0)"

URI_tuned-profiles-compat = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-profiles-compat-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-profiles-compat = "/usr/bin/bash ( ) tuned ( =  2.25.1)"
RPROVIDES:tuned-profiles-compat = "tuned-profiles-compat ( =  2.25.1-2.el10_0)"

URI_tuned-profiles-nfv = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-profiles-nfv-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-profiles-nfv = "tuned ( =  2.25.1) tuned-profiles-nfv-guest ( =  2.25.1) tuned-profiles-nfv-host ( =  2.25.1)"
RPROVIDES:tuned-profiles-nfv = "tuned-profiles-nfv ( =  2.25.1-2.el10_0)"

URI_tuned-profiles-nfv-guest = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-profiles-nfv-guest-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-profiles-nfv-guest = "tuned ( =  2.25.1) tuned-profiles-realtime ( =  2.25.1)"
RPROVIDES:tuned-profiles-nfv-guest = "config(tuned-profiles-nfv-guest) ( =  2.25.1-2.el10_0) tuned-profiles-nfv-guest ( =  2.25.1-2.el10_0)"

URI_tuned-profiles-nfv-host = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-profiles-nfv-host-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-profiles-nfv-host = "/usr/bin/bash ( ) tuned ( =  2.25.1) tuned-profiles-realtime ( =  2.25.1)"
RPROVIDES:tuned-profiles-nfv-host = "config(tuned-profiles-nfv-host) ( =  2.25.1-2.el10_0) tuned-profiles-nfv-host ( =  2.25.1-2.el10_0)"

URI_tuned-profiles-openshift = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-profiles-openshift-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-profiles-openshift = "tuned ( =  2.25.1)"
RPROVIDES:tuned-profiles-openshift = "tuned-profiles-openshift ( =  2.25.1-2.el10_0)"

URI_tuned-profiles-realtime = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-profiles-realtime-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-profiles-realtime = "tuned ( =  2.25.1)"
RPROVIDES:tuned-profiles-realtime = "config(tuned-profiles-realtime) ( =  2.25.1-2.el10_0) tuned-profiles-realtime ( =  2.25.1-2.el10_0)"

URI_tuned-utils-systemtap = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tuned-utils-systemtap-2.25.1-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tuned-utils-systemtap = "/usr/bin/python3 ( ) systemtap ( ) /usr/bin/stap ( ) tuned ( =  2.25.1-2.el10_0)"
RPROVIDES:tuned-utils-systemtap = "tuned-utils-systemtap ( =  2.25.1-2.el10_0)"
