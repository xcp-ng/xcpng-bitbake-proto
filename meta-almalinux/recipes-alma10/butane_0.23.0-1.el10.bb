
PN = "butane"
PE = "0"
PV = "0.23.0"
PR = "1.el10"
PACKAGES = "butane butane-redistributable"


URI_butane = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/butane-0.23.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:butane = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libresolv.so.2()(64bit) ( )"
RPROVIDES:butane = "bundled(golang(gopkg.in/yaml.v3)) ( =  3.0.1) bundled(golang(github.com/coreos/go-semver/semver)) ( =  0.3.1) bundled(golang(github.com/coreos/go-systemd/v22/unit)) ( =  22.5.0) bundled(golang(github.com/coreos/vcontext/json)) ( =  0.0.0-20230201181013.gitd72178a18687) bundled(golang(github.com/coreos/vcontext/path)) ( =  0.0.0-20230201181013.gitd72178a18687) bundled(golang(github.com/coreos/vcontext/report)) ( =  0.0.0-20230201181013.gitd72178a18687) bundled(golang(github.com/coreos/vcontext/tree)) ( =  0.0.0-20230201181013.gitd72178a18687) bundled(golang(github.com/coreos/vcontext/validate)) ( =  0.0.0-20230201181013.gitd72178a18687) bundled(golang(github.com/spf13/pflag)) ( =  1.0.6-0.20210604193023.gitd5e0c0615ace) bundled(golang(github.com/stretchr/testify/assert)) ( =  1.8.4) bundled(golang(github.com/vincent-petithory/dataurl)) ( =  1.0.0) bundled(golang(github.com/clarketm/json)) ( =  1.17.1) bundled(golang(github.com/coreos/ignition/v2/config/doc)) ( =  2.17.0) bundled(golang(github.com/coreos/ignition/v2/config/merge)) ( =  2.17.0) bundled(golang(github.com/coreos/ignition/v2/config/shared/errors)) ( =  2.17.0) bundled(golang(github.com/coreos/ignition/v2/config/shared/parse)) ( =  2.17.0) bundled(golang(github.com/coreos/ignition/v2/config/shared/validations)) ( =  2.17.0) bundled(golang(github.com/coreos/ignition/v2/config/util)) ( =  2.17.0) bundled(golang(github.com/coreos/ignition/v2/config/v3_0/types)) ( =  2.17.0) bundled(golang(github.com/coreos/ignition/v2/config/v3_1/types)) ( =  2.17.0) bundled(golang(github.com/coreos/ignition/v2/config/v3_2/types)) ( =  2.17.0) bundled(golang(github.com/coreos/ignition/v2/config/v3_3/types)) ( =  2.17.0) bundled(golang(github.com/coreos/ignition/v2/config/v3_4/types)) ( =  2.17.0) bundled(golang(github.com/coreos/ignition/v2/config/v3_5_experimental/types)) ( =  2.17.0) bundled(golang(github.com/coreos/ignition/v2/config/validate)) ( =  2.17.0) bundled(golang(github.com/coreos/vcontext/yaml)) ( =  0.0.0-20230201181013.gitd72178a18687) butane ( =  0.23.0-1.el10) butane(x86-64) ( =  0.23.0-1.el10) fcct ( =  0.23.0-1.el10) fedora-coreos-config-transpiler ( =  0.23.0-1.el10)"

URI_butane-redistributable = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/butane-redistributable-0.23.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:butane-redistributable = ""
RPROVIDES:butane-redistributable = "butane-redistributable ( =  0.23.0-1.el10)"
