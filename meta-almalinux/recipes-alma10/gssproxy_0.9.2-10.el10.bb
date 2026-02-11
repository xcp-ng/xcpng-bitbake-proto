
PN = "gssproxy"
PE = "0"
PV = "0.9.2"
PR = "10.el10"
PACKAGES = "gssproxy"


URI_gssproxy = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gssproxy-0.9.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gssproxy = " \
 systemd \
 libverto \
 systemd-libs \
 libverto-libev \
 keyutils-libs \
 krb5-libs \
 libref_array \
 bash \
 popt \
 glibc \
 libselinux \
 libini_config \
"
