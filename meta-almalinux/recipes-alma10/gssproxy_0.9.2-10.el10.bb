
PN = "gssproxy"
PE = "0"
PV = "0.9.2"
PR = "10.el10"
PACKAGES = "gssproxy"


URI_gssproxy = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gssproxy-0.9.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gssproxy = "/bin/sh ( ) systemd-units ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libselinux.so.1()(64bit) ( ) libpopt.so.0()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libkrb5.so.3()(64bit) ( ) libkrb5.so.3(krb5_3_MIT)(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libk5crypto.so.3()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libk5crypto.so.3(k5crypto_3_MIT)(64bit) ( ) libref_array.so.1()(64bit) ( ) libini_config.so.5()(64bit) ( ) libgssrpc.so.4()(64bit) ( ) libgssrpc.so.4(gssrpc_4_MIT)(64bit) ( ) libref_array.so.1(REF_ARRAY_0.1.1)(64bit) ( ) libverto.so.1()(64bit) ( ) libini_config.so.5(INI_CONFIG_1.1.0)(64bit) ( ) keyutils-libs ( ) libini_config.so.5(INI_CONFIG_1.2.0)(64bit) ( ) libverto-module-base ( ) krb5-libs ( >=  1.12.0) libini_config ( >=  1.2.0)"
RPROVIDES:gssproxy = "config(gssproxy) ( =  0.9.2-10.el10) gssproxy ( =  0.9.2-10.el10) gssproxy(x86-64) ( =  0.9.2-10.el10)"
