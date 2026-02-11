
PN = "opentelemetry-collector"
PE = "0"
PV = "0.127.0"
PR = "3.el10_0"
PACKAGES = "opentelemetry-collector"


URI_opentelemetry-collector = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/opentelemetry-collector-0.127.0-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:opentelemetry-collector = "/bin/sh ( ) shadow-utils ( ) util-linux ( ) /usr/sbin/useradd ( ) /usr/bin/getent ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/bash ( ) libresolv.so.2()(64bit) ( ) /usr/sbin/userdel ( )"
RPROVIDES:opentelemetry-collector = "opentelemetry-collector ( =  0.127.0-3.el10_0) opentelemetry-collector(x86-64) ( =  0.127.0-3.el10_0)"
