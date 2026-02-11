
PN = "grafana-pcp"
PE = "0"
PV = "5.2.2"
PR = "3.el10_0"
PACKAGES = "grafana-pcp"


URI_grafana-pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/grafana-pcp-5.2.2-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:grafana-pcp = " \
 glibc \
 grafana \
 systemd \
 bash \
"
