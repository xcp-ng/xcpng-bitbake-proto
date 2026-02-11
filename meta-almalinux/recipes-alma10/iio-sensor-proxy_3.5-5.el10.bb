
PN = "iio-sensor-proxy"
PE = "0"
PV = "3.5"
PR = "5.el10"
PACKAGES = "iio-sensor-proxy iio-sensor-proxy-docs"


URI_iio-sensor-proxy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iio-sensor-proxy-3.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iio-sensor-proxy = "
 systemd
 libgcc
 libgudev
 polkit-libs
 bash
 glib2
 glibc
"

URI_iio-sensor-proxy-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/iio-sensor-proxy-docs-3.5-5.el10.noarch.rpm;unpack=0"
RDEPENDS:iio-sensor-proxy-docs = ""
