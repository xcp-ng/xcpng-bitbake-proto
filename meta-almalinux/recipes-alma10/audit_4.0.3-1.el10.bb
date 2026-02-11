
inherit dnf-bridge

PN = "audit"
PE = "0"
PV = "4.0.3"
PR = "1.el10"
PACKAGES = "audispd-plugins audispd-plugins-zos audit audit-libs audit-rules audit-libs-devel python3-audit"


URI_audispd-plugins = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/audispd-plugins-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:audispd-plugins = " \
 audit \
 audit-libs \
 libcap-ng \
 krb5-libs \
 glibc \
"

URI_audispd-plugins-zos = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/audispd-plugins-zos-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:audispd-plugins-zos = " \
 audit \
 audit-libs \
 libcap-ng \
 glibc \
 openldap \
"

URI_audit = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/audit-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:audit = " \
 systemd \
 audit-libs \
 audit-rules \
 krb5-libs \
 bash \
 glibc \
 coreutils \
"

URI_audit-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/audit-libs-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:audit-libs = " \
 glibc \
 libcap-ng \
"

URI_audit-rules = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/audit-rules-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:audit-rules = " \
 glibc \
 audit-libs \
 bash \
"

URI_audit-libs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/audit-libs-devel-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:audit-libs-devel = " \
 audit-libs \
 libcap-ng-devel \
 kernel-headers \
 pkgconf-pkg-config \
"

URI_python3-audit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-audit-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-audit = " \
 glibc \
 audit-libs \
 python3 \
 libcap-ng \
"
