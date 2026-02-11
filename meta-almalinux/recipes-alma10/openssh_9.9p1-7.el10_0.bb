
PN = "openssh"
PE = "0"
PV = "9.9p1"
PR = "7.el10_0"
PACKAGES = "openssh openssh-clients openssh-keycat openssh-server openssh-askpass openssh-keysign openssh-sk-dummy"


URI_openssh = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openssh-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) /sbin/nologin ( ) audit-libs ( >=  1.0.8) libselinux ( >=  2.3-5)"
RPROVIDES:openssh = "openssh ( =  9.9p1-7.el10_0) config(openssh) ( =  9.9p1-7.el10_0) openssh(x86-64) ( =  9.9p1-7.el10_0)"

URI_openssh-clients = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openssh-clients-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh-clients = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) /usr/bin/sh ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libselinux.so.1()(64bit) ( ) libz.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libedit.so.0()(64bit) ( ) libfido2.so.1()(64bit) ( ) openssh ( =  9.9p1-7.el10_0) crypto-policies ( >=  20220824-1)"
RPROVIDES:openssh-clients = "config(openssh-clients) ( =  9.9p1-7.el10_0) openssh-clients ( =  9.9p1-7.el10_0) openssh-clients(x86-64) ( =  9.9p1-7.el10_0)"

URI_openssh-keycat = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openssh-keycat-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh-keycat = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) openssh ( =  9.9p1-7.el10_0)"
RPROVIDES:openssh-keycat = "config(openssh-keycat) ( =  9.9p1-7.el10_0) openssh-keycat ( =  9.9p1-7.el10_0) openssh-keycat(x86-64) ( =  9.9p1-7.el10_0)"

URI_openssh-server = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openssh-server-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh-server = "/bin/sh ( ) systemd ( ) /usr/sbin/useradd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libselinux.so.1()(64bit) ( ) libz.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) /usr/bin/bash ( ) libkrb5.so.3()(64bit) ( ) libkrb5.so.3(krb5_3_MIT)(64bit) ( ) libcom_err.so.2()(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libaudit.so.1()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) openssh ( =  9.9p1-7.el10_0) crypto-policies ( >=  20220824-1) pam ( >=  1.0.1-3)"
RPROVIDES:openssh-server = "group(sshd) ( ) config(openssh-server) ( =  9.9p1-7.el10_0) openssh-server ( =  9.9p1-7.el10_0) openssh-server(x86-64) ( =  9.9p1-7.el10_0) user(sshd) ( =  dSBzc2hkIDc0ICJQcml2aWxlZ2Utc2VwYXJhdGVkIFNTSCIgL3Vzci9zaGFyZS9lbXB0eS5zc2hkIC0A)"

URI_openssh-askpass = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openssh-askpass-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh-askpass = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) openssh ( =  9.9p1-7.el10_0)"
RPROVIDES:openssh-askpass = "openssh-askpass ( =  9.9p1-7.el10_0) openssh-askpass(x86-64) ( =  9.9p1-7.el10_0)"

URI_openssh-keysign = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openssh-keysign-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh-keysign = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) openssh ( =  9.9p1-7.el10_0)"
RPROVIDES:openssh-keysign = "openssh-keysign ( =  9.9p1-7.el10_0) openssh-keysign(x86-64) ( =  9.9p1-7.el10_0)"

URI_openssh-sk-dummy = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openssh-sk-dummy-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh-sk-dummy = "rtld(GNU_HASH) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libc.so.6(GLIBC_2.36)(64bit) ( ) openssh ( =  9.9p1-7.el10_0)"
RPROVIDES:openssh-sk-dummy = "openssh-sk-dummy ( =  9.9p1-7.el10_0) openssh-sk-dummy(x86-64) ( =  9.9p1-7.el10_0)"
