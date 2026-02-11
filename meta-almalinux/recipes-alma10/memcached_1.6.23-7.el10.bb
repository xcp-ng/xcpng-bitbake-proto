
PN = "memcached"
PE = "0"
PV = "1.6.23"
PR = "7.el10"
PACKAGES = "memcached memcached-selinux memcached-devel"


URI_memcached = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/memcached-1.6.23-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:memcached = "/bin/sh ( ) systemd ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) perl(strict) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/perl ( ) libsasl2.so.3()(64bit) ( ) libevent-2.1.so.7()(64bit) ( ) perl(IO::Socket::INET) ( ) memcached-selinux ( if  selinux-policy-targeted)"
RPROVIDES:memcached = "group(memcached) ( ) config(memcached) ( =  1.6.23-7.el10) memcached ( =  1.6.23-7.el10) memcached(x86-64) ( =  1.6.23-7.el10) user(memcached) ( =  dSBtZW1jYWNoZWQgLSAibWVtY2FjaGVkIGRhZW1vbiIgLQAA)"

URI_memcached-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/memcached-selinux-1.6.23-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:memcached-selinux = "/bin/sh ( ) policycoreutils ( ) policycoreutils-python-utils ( ) libselinux-utils ( ) selinux-policy-base ( >=  40.13.13) selinux-policy ( >=  40.13.13)"
RPROVIDES:memcached-selinux = "memcached-selinux ( =  1.6.23-7.el10) memcached-selinux(x86-64) ( =  1.6.23-7.el10)"

URI_memcached-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/memcached-devel-1.6.23-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:memcached-devel = "memcached ( =  1.6.23-7.el10)"
RPROVIDES:memcached-devel = "memcached-devel ( =  1.6.23-7.el10) memcached-devel(x86-64) ( =  1.6.23-7.el10)"
