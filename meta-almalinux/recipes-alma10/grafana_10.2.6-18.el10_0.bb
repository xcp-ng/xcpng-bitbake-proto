
PN = "grafana"
PE = "0"
PV = "10.2.6"
PR = "18.el10_0"
PACKAGES = "grafana grafana-selinux"


URI_grafana = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/grafana-10.2.6-18.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:grafana = "
 shadow-utils
 systemd
 shared-mime-info
 bash
 grafana-selinux
 glibc
"

URI_grafana-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/grafana-selinux-10.2.6-18.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:grafana-selinux = "
 policycoreutils-python-utils
 policycoreutils
 grafana
 bash
 initscripts-service
 selinux-policy-targeted
 selinux-policy
"
