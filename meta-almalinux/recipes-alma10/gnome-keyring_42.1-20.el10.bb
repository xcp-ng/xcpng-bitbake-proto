
PN = "gnome-keyring"
PE = "0"
PV = "42.1"
PR = "20.el10"
PACKAGES = "gnome-keyring gnome-keyring-pam"


URI_gnome-keyring = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-keyring-42.1-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-keyring = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libgcrypt.so.20()(64bit) ( ) libgcrypt.so.20(GCRYPT_1.6)(64bit) ( ) /usr/bin/ssh-add ( ) /usr/bin/ssh-agent ( ) gcr3 ( ) libgck-1.so.0()(64bit) ( ) libgcr-base-3.so.1()(64bit) ( )"
RPROVIDES:gnome-keyring = "gnome-keyring(x86-64) ( =  42.1-20.el10) gnome-keyring ( =  42.1-20.el10)"

URI_gnome-keyring-pam = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-keyring-pam-42.1-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-keyring-pam = "rtld(GNU_HASH) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) pam(x86-64) ( ) gnome-keyring(x86-64) ( =  42.1-20.el10)"
RPROVIDES:gnome-keyring-pam = "gnome-keyring-pam ( =  42.1-20.el10) gnome-keyring-pam(x86-64) ( =  42.1-20.el10)"
