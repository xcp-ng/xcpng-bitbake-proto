
PN = "audit"
PE = "0"
PV = "4.0.3"
PR = "1.el10"
PACKAGES = "audispd-plugins audispd-plugins-zos audit audit-libs audit-rules audit-libs-devel python3-audit"


URI_audispd-plugins = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/audispd-plugins-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:audispd-plugins = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libkrb5.so.3()(64bit) ( ) libkrb5.so.3(krb5_3_MIT)(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libaudit.so.1()(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libauparse.so.0()(64bit) ( ) audit-libs(x86-64) ( =  4.0.3-1.el10) audit(x86-64) ( =  4.0.3-1.el10)"
RPROVIDES:audispd-plugins = "audispd-plugins ( =  4.0.3-1.el10) audispd-plugins(x86-64) ( =  4.0.3-1.el10) config(audispd-plugins) ( =  4.0.3-1.el10)"

URI_audispd-plugins-zos = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/audispd-plugins-zos-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:audispd-plugins-zos = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) liblber.so.2()(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libauparse.so.0()(64bit) ( ) audit-libs(x86-64) ( =  4.0.3-1.el10) audit(x86-64) ( =  4.0.3-1.el10)"
RPROVIDES:audispd-plugins-zos = "audispd-plugins-zos ( =  4.0.3-1.el10) audispd-plugins-zos(x86-64) ( =  4.0.3-1.el10) config(audispd-plugins-zos) ( =  4.0.3-1.el10)"

URI_audit = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/audit-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:audit = "/bin/sh ( ) coreutils ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libkrb5.so.3()(64bit) ( ) libkrb5.so.3(krb5_3_MIT)(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libaudit.so.1()(64bit) ( ) libauparse.so.0()(64bit) ( ) audit-libs(x86-64) ( =  4.0.3-1.el10) audit-rules(x86-64) ( =  4.0.3-1.el10)"
RPROVIDES:audit = "audit(x86-64) ( =  4.0.3-1.el10) audit ( =  4.0.3-1.el10) config(audit) ( =  4.0.3-1.el10)"

URI_audit-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/audit-libs-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:audit-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcap-ng.so.0()(64bit) ( )"
RPROVIDES:audit-libs = "libaudit.so.1()(64bit) ( ) libauparse.so.0()(64bit) ( ) audit-libs(x86-64) ( =  4.0.3-1.el10) audit-libs ( =  4.0.3-1.el10) config(audit-libs) ( =  4.0.3-1.el10)"

URI_audit-rules = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/audit-rules-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:audit-rules = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libaudit.so.1()(64bit) ( ) libauparse.so.0()(64bit) ( )"
RPROVIDES:audit-rules = "audit-rules(x86-64) ( =  4.0.3-1.el10) audit-rules ( =  4.0.3-1.el10) config(audit-rules) ( =  4.0.3-1.el10)"

URI_audit-libs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/audit-libs-devel-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:audit-libs-devel = "/usr/bin/pkg-config ( ) libaudit.so.1()(64bit) ( ) libauparse.so.0()(64bit) ( ) pkgconfig(libcap-ng) ( ) audit-libs(x86-64) ( =  4.0.3-1.el10) kernel-headers ( >=  5.0)"
RPROVIDES:audit-libs-devel = "audit-libs-devel ( =  4.0.3-1.el10) audit-libs-devel(x86-64) ( =  4.0.3-1.el10) pkgconfig(audit) ( =  4.0.3) pkgconfig(auparse) ( =  4.0.3)"

URI_python3-audit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-audit-4.0.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-audit = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libaudit.so.1()(64bit) ( ) libauparse.so.0()(64bit) ( ) python(abi) ( =  3.12) audit-libs(x86-64) ( =  4.0.3-1.el10)"
RPROVIDES:python3-audit = "audit-libs-python3 ( =  4.0.3-1.el10) audit-libs-python3(x86-64) ( =  4.0.3-1.el10) python-audit ( =  4.0.3-1.el10) python3-audit ( =  4.0.3-1.el10) python3-audit(x86-64) ( =  4.0.3-1.el10) python3.12-audit ( =  4.0.3-1.el10)"
