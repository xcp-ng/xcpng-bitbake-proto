
PN = "rust-ssh-key-dir"
PE = "0"
PV = "0.1.4"
PR = "9.el10"
PACKAGES = "ssh-key-dir"


URI_ssh-key-dir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ssh-key-dir-0.1.4-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ssh-key-dir = "/bin/sh ( ) systemd ( ) openssh-server ( ) rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( )"
RPROVIDES:ssh-key-dir = "bundled(crate(cfg-if)) ( =  1.0.0) bundled(crate(bitflags)) ( =  1.3.2) bundled(crate(autocfg)) ( =  1.1.0) bundled(crate(log)) ( =  0.4.17) bundled(crate(anyhow)) ( =  1.0.65) bundled(crate(clap)) ( =  3.2.22) bundled(crate(clap_lex)) ( =  0.2.2) bundled(crate(hashbrown)) ( =  0.11.2) bundled(crate(indexmap)) ( =  1.8.2) bundled(crate(libc)) ( =  0.2.131) bundled(crate(once_cell)) ( =  1.12.0) bundled(crate(os_str_bytes)) ( =  6.1.0) bundled(crate(textwrap)) ( =  0.15.1) bundled(crate(users)) ( =  0.11.0) config(ssh-key-dir) ( =  0.1.4-9.el10) ssh-key-dir ( =  0.1.4-9.el10) ssh-key-dir(x86-64) ( =  0.1.4-9.el10)"
