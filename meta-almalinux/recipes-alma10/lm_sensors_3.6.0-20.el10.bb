
PN = "lm_sensors"
PE = "0"
PV = "3.6.0"
PR = "20.el10"
PACKAGES = "lm_sensors lm_sensors-devel lm_sensors-libs lm_sensors-sensord"


URI_lm_sensors = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lm_sensors-3.6.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lm_sensors = " \
 perl-constant \
 lm_sensors-libs \
 systemd \
 perl-libs \
 perl-vars \
 kmod \
 dmidecode \
 perl-Fcntl \
 perl-File-Basename \
 bash \
 glibc \
 perl-interpreter \
"

URI_lm_sensors-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lm_sensors-devel-3.6.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lm_sensors-devel = " \
 lm_sensors-libs \
"

URI_lm_sensors-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lm_sensors-libs-3.6.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lm_sensors-libs = " \
 glibc \
"

URI_lm_sensors-sensord = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lm_sensors-sensord-3.6.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lm_sensors-sensord = " \
 lm_sensors \
 lm_sensors-libs \
 bash \
 glibc \
 rrdtool \
"
